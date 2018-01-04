package org.gradle.test.performance23_2

import org.junit.Assert.*

class Test23_173 {
    private val production = Production23_173("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}