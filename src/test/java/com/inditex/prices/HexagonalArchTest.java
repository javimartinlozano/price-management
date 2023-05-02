package com.inditex.prices;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;
import static com.tngtech.archunit.library.Architectures.layeredArchitecture;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RestController;

import com.tngtech.archunit.core.importer.ImportOption;
import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;

@AnalyzeClasses(packages = "com.inditex.prices",
    importOptions = { ImportOption.DoNotIncludeTests.class })
public class HexagonalArchTest {

    // naming convention tests
    @ArchTest
    static final ArchRule application_naming_check = classes()
        .that().resideInAPackage("..application")
        .should().haveSimpleNameEndingWith("UseCase");

    @ArchTest
    static final ArchRule infrastructure_output_adapter_naming_check = classes()
        .that().resideInAPackage("..infrastructure.output..")
        .should().haveSimpleNameEndingWith("Repository");

    @ArchTest
    static final ArchRule infrastructure_output_port_naming_check = classes()
        .that().resideInAPackage("..infrastructure.output.port")
        .should().haveSimpleNameEndingWith("Repository");

    @ArchTest
    static final ArchRule infrastructure_rest_input_adapter_naming_check = classes()
        .that().resideInAPackage("..infrastructure.rest.input.adapter")
        .should().haveSimpleNameEndingWith("API");

    @ArchTest
    static final ArchRule infrastructure_rest_input_port_naming_check = classes()
        .that().resideInAPackage("..infrastructure.rest.input.port")
        .should().haveSimpleNameEndingWith("InputPort");


    // class location tests
    @ArchTest
    static final ArchRule use_cases_should_located_in_application = classes()
        .that().areAnnotatedWith(Service.class)
        .should().resideInAPackage("..application..");

    @ArchTest
    static final ArchRule entities_should_located_in_domain_model = classes()
        .that().areAnnotatedWith(Entity.class)
        .and().areAnnotatedWith(Table.class)
        .should().resideInAPackage("..domain.model..");

    @ArchTest
    static final ArchRule repositories_should_located_in_output_adapter = classes()
        .that().areAnnotatedWith(Repository.class)
        .should().resideInAPackage("..infrastructure.output..");

    @ArchTest
    static final ArchRule controllers_should_located_in_infrastructure_rest_input_adapter = classes()
        .that().areAnnotatedWith(RestController.class)
        .should().resideInAPackage("..infrastructure.rest.input.adapter..");

    @ArchTest
    static final ArchRule controller_advice_should_located_in_infrastructure_rest_input_handler = classes()
        .that().areAnnotatedWith(ControllerAdvice.class)
        .should().resideInAPackage("..infrastructure.rest.input.handler..");


    // restrict access tests
    @ArchTest
    static final ArchRule domain_layer_should_only_be_accessed_by  = classes()
        .that().resideInAPackage("..domain..")
        .should().onlyBeAccessed()
        .byAnyPackage("..domain..", "..application..");

    @ArchTest
    static final ArchRule application_layer_should_only_be_accessed_by  = classes()
        .that().resideInAPackage("..application..")
        .should().onlyBeAccessed()
        .byAnyPackage("..application..", "..infrastructure..");

    @ArchTest
    static final ArchRule infrastructure_output_port_layer_should_only_be_accessed_by  = classes()
        .that().resideInAPackage("..infrastructure.output.port..")
        .should().onlyBeAccessed()
        .byAnyPackage("..infrastructure..","..application");

    @ArchTest
    static final ArchRule infrastructure_input_adapter_layer_should_only_be_accessed_by  = classes()
        .that().resideInAPackage("..infrastructure.rest.input.adapter..")
        .should().onlyBeAccessed()
        .byAnyPackage("..infrastructure..");

    @ArchTest
    static final ArchRule infrastructure_rest_input_port_layer_should_only_be_accessed_by  = classes()
        .that().resideInAPackage("..infrastructure.rest.input.port..")
        .should().onlyBeAccessed()
        .byAnyPackage("..infrastructure..","..application");

    // layer tests
    @ArchTest
    static final ArchRule follow_hexagonal_architecture_structure = layeredArchitecture()
        .consideringOnlyDependenciesInLayers()
        .optionalLayer("application").definedBy("..application..")
        .layer("domain").definedBy("..domain..")
        .optionalLayer("adapters").definedBy("..adapter..")
        .optionalLayer("infrastructure").definedBy("..infrastructure..");
}
