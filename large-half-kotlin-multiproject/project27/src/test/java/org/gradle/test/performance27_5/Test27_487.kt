package org.gradle.test.performance27_5

import org.junit.Assert.*

class Test27_487 {
    private val production = Production27_487("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}