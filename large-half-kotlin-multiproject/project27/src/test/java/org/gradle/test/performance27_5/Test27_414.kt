package org.gradle.test.performance27_5

import org.junit.Assert.*

class Test27_414 {
    private val production = Production27_414("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}