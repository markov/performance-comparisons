package org.gradle.test.performance23_2

import org.junit.Assert.*

class Test23_158 {
    private val production = Production23_158("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}