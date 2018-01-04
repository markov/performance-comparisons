package org.gradle.test.performance16_1

import org.junit.Assert.*

class Test16_3 {
    private val production = Production16_3("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}