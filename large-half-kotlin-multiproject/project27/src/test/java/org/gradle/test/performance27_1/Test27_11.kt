package org.gradle.test.performance27_1

import org.junit.Assert.*

class Test27_11 {
    private val production = Production27_11("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}