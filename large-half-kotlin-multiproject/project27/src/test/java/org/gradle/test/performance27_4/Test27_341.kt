package org.gradle.test.performance27_4

import org.junit.Assert.*

class Test27_341 {
    private val production = Production27_341("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}