package org.gradle.test.performance16_5

import org.junit.Assert.*

class Test16_418 {
    private val production = Production16_418("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}