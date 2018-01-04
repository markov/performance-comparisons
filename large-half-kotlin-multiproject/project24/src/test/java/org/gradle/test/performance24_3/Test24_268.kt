package org.gradle.test.performance24_3

import org.junit.Assert.*

class Test24_268 {
    private val production = Production24_268("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}