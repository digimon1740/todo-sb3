//package com.digimon.todosb3
//
//import org.junit.runner.RunWith
//import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
//import org.springframework.boot.test.context.SpringBootTest
//import org.springframework.boot.test.util.TestPropertyValues
//import org.springframework.context.ApplicationContextInitializer
//import org.springframework.context.ConfigurableApplicationContext
//import org.springframework.test.context.ContextConfiguration
//import org.springframework.test.context.junit4.SpringRunner
//import org.testcontainers.containers.MongoDBContainer
//
//@RunWith(SpringRunner::class)
//@SpringBootTest
//@ContextConfiguration(initializers = [AbstractIntegrationTest.Initializer::class])
//@AutoConfigureMockMvc
//abstract class AbstractIntegrationTest {
//
//    companion object {
//        val mongoDBContainer = MongoDBContainer("mongo:4.0.10").apply {
//            withExposedPorts(27017)
//        }
//
////        val redisContainer = GenericContainer<Nothing>("redis:3-alpine")
////                .apply { withExposedPorts(6379) }
//    }
//
//    internal class Initializer : ApplicationContextInitializer<ConfigurableApplicationContext> {
//        override fun initialize(configurableApplicationContext: ConfigurableApplicationContext) {
//            mongoDBContainer.start()
//
//            TestPropertyValues.of(
//                "spring.data.mongodb.host=${mongoDBContainer.host}",
//            ).applyTo(configurableApplicationContext.environment)
//        }
//    }
//}