package org.gradle.test.performance27_5

import org.junit.Assert.*

class Test27_420 {
    private val production = Production27_420("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}