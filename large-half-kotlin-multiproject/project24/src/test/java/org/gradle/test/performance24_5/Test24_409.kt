package org.gradle.test.performance24_5

import org.junit.Assert.*

class Test24_409 {
    private val production = Production24_409("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}