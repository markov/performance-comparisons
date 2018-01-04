package org.gradle.test.performance23_2

import org.junit.Assert.*

class Test23_104 {
    private val production = Production23_104("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}