package org.gradle.test.performance15_4

import org.junit.Assert.*

class Test15_325 {
    private val production = Production15_325("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}