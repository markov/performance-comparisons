package org.gradle.test.performance27_4

import org.junit.Assert.*

class Test27_377 {
    private val production = Production27_377("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}