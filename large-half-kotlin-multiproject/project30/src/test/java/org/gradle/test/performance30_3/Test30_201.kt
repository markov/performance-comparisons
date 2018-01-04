package org.gradle.test.performance30_3

import org.junit.Assert.*

class Test30_201 {
    private val production = Production30_201("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}