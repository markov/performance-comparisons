package org.gradle.test.performance30_2

import org.junit.Assert.*

class Test30_105 {
    private val production = Production30_105("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}