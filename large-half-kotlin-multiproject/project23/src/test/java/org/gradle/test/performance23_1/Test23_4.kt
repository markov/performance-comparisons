package org.gradle.test.performance23_1

import org.junit.Assert.*

class Test23_4 {
    private val production = Production23_4("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}