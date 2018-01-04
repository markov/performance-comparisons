package org.gradle.test.performance23_3

import org.junit.Assert.*

class Test23_218 {
    private val production = Production23_218("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}