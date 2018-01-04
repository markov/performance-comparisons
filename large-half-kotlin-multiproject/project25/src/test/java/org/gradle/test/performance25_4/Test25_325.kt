package org.gradle.test.performance25_4

import org.junit.Assert.*

class Test25_325 {
    private val production = Production25_325("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}