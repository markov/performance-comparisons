package org.gradle.test.performance27_4

import org.junit.Assert.*

class Test27_363 {
    private val production = Production27_363("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}