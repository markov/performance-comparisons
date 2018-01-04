package org.gradle.test.performance46_5

import org.junit.Assert.*

class Test46_462 {
    private val production = Production46_462("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
