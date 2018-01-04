package org.gradle.test.performance16_2

import org.junit.Assert.*

class Test16_157 {
    private val production = Production16_157("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}