package org.gradle.test.performance14_4

import org.junit.Assert.*

class Test14_314 {
    private val production = Production14_314("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}