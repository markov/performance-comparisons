package org.gradle.test.performance15_1

import org.junit.Assert.*

class Test15_18 {
    private val production = Production15_18("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}