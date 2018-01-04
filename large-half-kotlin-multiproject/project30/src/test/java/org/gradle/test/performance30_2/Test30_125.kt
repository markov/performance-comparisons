package org.gradle.test.performance30_2

import org.junit.Assert.*

class Test30_125 {
    private val production = Production30_125("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}