package org.gradle.test.performance15_1

import org.junit.Assert.*

class Test15_51 {
    private val production = Production15_51("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}