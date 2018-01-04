package org.gradle.test.performance23_3

import org.junit.Assert.*

class Test23_205 {
    private val production = Production23_205("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}