package org.gradle.test.performance27_4

import org.junit.Assert.*

class Test27_381 {
    private val production = Production27_381("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}