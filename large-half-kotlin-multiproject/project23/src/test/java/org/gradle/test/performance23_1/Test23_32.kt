package org.gradle.test.performance23_1

import org.junit.Assert.*

class Test23_32 {
    private val production = Production23_32("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}