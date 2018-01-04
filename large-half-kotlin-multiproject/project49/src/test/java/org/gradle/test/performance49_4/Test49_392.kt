package org.gradle.test.performance49_4

import org.junit.Assert.*

class Test49_392 {
    private val production = Production49_392("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
