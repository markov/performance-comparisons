package org.gradle.test.performance23_5

import org.junit.Assert.*

class Test23_491 {
    private val production = Production23_491("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}