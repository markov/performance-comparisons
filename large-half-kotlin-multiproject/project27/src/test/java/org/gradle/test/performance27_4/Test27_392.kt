package org.gradle.test.performance27_4

import org.junit.Assert.*

class Test27_392 {
    private val production = Production27_392("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}