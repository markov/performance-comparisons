package org.gradle.test.performance27_5

import org.junit.Assert.*

class Test27_451 {
    private val production = Production27_451("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}