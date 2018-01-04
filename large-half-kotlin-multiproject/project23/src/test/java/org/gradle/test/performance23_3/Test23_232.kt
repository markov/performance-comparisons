package org.gradle.test.performance23_3

import org.junit.Assert.*

class Test23_232 {
    private val production = Production23_232("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}