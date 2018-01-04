package org.gradle.test.performance23_2

import org.junit.Assert.*

class Test23_101 {
    private val production = Production23_101("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}