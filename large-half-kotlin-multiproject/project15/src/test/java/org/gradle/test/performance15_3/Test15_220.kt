package org.gradle.test.performance15_3

import org.junit.Assert.*

class Test15_220 {
    private val production = Production15_220("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}