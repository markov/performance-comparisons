package org.gradle.test.performance46_2

import org.junit.Assert.*

class Test46_146 {
    private val production = Production46_146("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
