package org.gradle.test.performance30_2

import org.junit.Assert.*

class Test30_109 {
    private val production = Production30_109("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}