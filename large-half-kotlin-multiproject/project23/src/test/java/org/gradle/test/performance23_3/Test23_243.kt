package org.gradle.test.performance23_3

import org.junit.Assert.*

class Test23_243 {
    private val production = Production23_243("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}