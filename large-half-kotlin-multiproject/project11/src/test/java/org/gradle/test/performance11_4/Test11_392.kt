package org.gradle.test.performance11_4

import org.junit.Assert.*

class Test11_392 {
    private val production = Production11_392("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}