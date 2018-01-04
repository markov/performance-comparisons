package org.gradle.test.performance27_4

import org.junit.Assert.*

class Test27_334 {
    private val production = Production27_334("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}