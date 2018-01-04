package org.gradle.test.performance23_4

import org.junit.Assert.*

class Test23_314 {
    private val production = Production23_314("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}