package org.gradle.test.performance46_2

import org.junit.Assert.*

class Test46_129 {
    private val production = Production46_129("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
