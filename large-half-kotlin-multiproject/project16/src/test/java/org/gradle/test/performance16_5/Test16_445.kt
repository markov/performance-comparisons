package org.gradle.test.performance16_5

import org.junit.Assert.*

class Test16_445 {
    private val production = Production16_445("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}