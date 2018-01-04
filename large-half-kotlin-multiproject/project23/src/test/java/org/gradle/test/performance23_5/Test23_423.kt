package org.gradle.test.performance23_5

import org.junit.Assert.*

class Test23_423 {
    private val production = Production23_423("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}