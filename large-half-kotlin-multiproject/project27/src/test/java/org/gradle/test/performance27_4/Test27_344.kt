package org.gradle.test.performance27_4

import org.junit.Assert.*

class Test27_344 {
    private val production = Production27_344("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}