package org.gradle.test.performance23_3

import org.junit.Assert.*

class Test23_249 {
    private val production = Production23_249("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}