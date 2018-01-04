package org.gradle.test.performance25_5

import org.junit.Assert.*

class Test25_482 {
    private val production = Production25_482("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}