package org.gradle.test.performance43_4

import org.junit.Assert.*

class Test43_381 {
    private val production = Production43_381("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
