package org.gradle.test.performance23_1

import org.junit.Assert.*

class Test23_30 {
    private val production = Production23_30("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}