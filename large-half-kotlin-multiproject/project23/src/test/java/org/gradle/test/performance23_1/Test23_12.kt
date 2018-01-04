package org.gradle.test.performance23_1

import org.junit.Assert.*

class Test23_12 {
    private val production = Production23_12("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}