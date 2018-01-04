package org.gradle.test.performance16_1

import org.junit.Assert.*

class Test16_28 {
    private val production = Production16_28("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}